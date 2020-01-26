package net.twisterrob.real.test

import android.content.res.Resources
import android.view.View
import androidx.annotation.MainThread
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.OnScrollListener
import androidx.test.espresso.IdlingResource

class RecyclerViewScrollingIdlingResource(
	private val recyclerView: RecyclerView
) : IdlingResource {

	private var callback: IdlingResource.ResourceCallback? = null

	override fun registerIdleTransitionCallback(callback: IdlingResource.ResourceCallback) {
		this.callback = callback
	}

	/**
	 * Include the [RecyclerView]'s ID to see which view this idling resource is polling in case it misbehaves.
	 * Include the the [hashCode] to make it more unique in case multiple of the same IDs exist within the same UI.
	 *
	 * If the same view is registered twice, the name will be same and trigger duplicate behavior.
	 * @see androidx.test.espresso.base.IdlingResourceRegistry.logDuplicateRegistrationError
	 */
	override fun getName(): String =
		"${RecyclerViewScrollingIdlingResource::class.java.simpleName}(${recyclerView.idAsString})@${recyclerView.hashCode()}"

	@MainThread
	override fun isIdleNow(): Boolean {
		val isIdle = recyclerView.scrollState == RecyclerView.SCROLL_STATE_IDLE
		if (!isIdle) {
			recyclerView.addOnScrollListener(object : OnScrollListener() {
				override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
					if (newState == RecyclerView.SCROLL_STATE_IDLE) {
						recyclerView.removeOnScrollListener(this)
						callback?.onTransitionToIdle()
					}
				}
			})
		}
		return isIdle
	}
}

private val View.idAsString: String
	get() =
		try {
			context.resources.getResourceName(id)
		} catch (ex: Resources.NotFoundException) {
			"dynamic id=$id"
		}
