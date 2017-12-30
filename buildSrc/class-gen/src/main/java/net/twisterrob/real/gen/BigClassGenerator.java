package net.twisterrob.real.gen;

import java.io.*;

/**
 * 65536 max constant pool size:
 * <ul>
 * <li>65536 is not a 16 bit number, so the max <b>number of constants in the pool</b> is actually 65335</li>
 * <li>constant pool #0 is reserved,</li>
 * <li>65522 (+ 12 = 65534) is the max method count,</li>
 * <li>65523 (+ 12 = 65535) should be possible,<br>
 *     but {@code cp_info constant_pool[constant_pool_count-1]}</li>
 * </ul>
 */
public class BigClassGenerator {

	public static void generate(Writer out, String packageName, String className, int n) {
		try (PrintWriter printer = new PrintWriter(out, false)) {
			printer.printf("package %s;\n\n", packageName);
			// #2 (#11) extends #3 (#12)
			printer.printf("public class %s /* extends Object */ {\n", className);
			// invoke #1 (== #3.#10 == #3.#4:#5)
			printer.printf("\t// %s() { super(); }\n", className);
			// on constant for each
			for (int i = 0; i < n; ++i) {
				printer.printf("\tvoid m%d() {}\n", (i + 1));
			}
			printer.printf("}\n");
			// Code (#6), LineNumberTable (#7), SourceFile (#8), BigClass.java (#9)
		}
	}
}
