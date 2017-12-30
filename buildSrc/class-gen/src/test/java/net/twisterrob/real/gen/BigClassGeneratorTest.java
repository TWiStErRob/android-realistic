package net.twisterrob.real.gen;

import java.io.StringWriter;

import org.junit.Test;

import static org.junit.Assert.*;

public class BigClassGeneratorTest {

	@Test public void generatesEmptyClass() {
		StringWriter memory = new StringWriter();
		BigClassGenerator.generate(memory, "my.test_package", "EmptyClass", 0);
		assertEquals("package my.test_package;\n"
				+ "\n"
				+ "public class EmptyClass /* extends Object */ {\n"
				+ "\t// EmptyClass() { super(); }\n"
				+ "}\n", memory.toString());
	}

	@Test public void generatesMethods() {
		StringWriter memory = new StringWriter();
		BigClassGenerator.generate(memory, "my.test_package", "ClassWithSomeMethods", 3);
		assertEquals("package my.test_package;\n"
				+ "\n"
				+ "public class ClassWithSomeMethods /* extends Object */ {\n"
				+ "\t// ClassWithSomeMethods() { super(); }\n"
				+ "\tvoid m1() {}\n"
				+ "\tvoid m2() {}\n"
				+ "\tvoid m3() {}\n"
				+ "}\n", memory.toString());
	}
}
