package net.guilhermelacerda.exemplobuild.tests;

import static org.junit.Assert.*;

import net.guilhermelacerda.exemplobuild.AloMundo;

import org.junit.Test;

public class AloMundoTest {

	@Test
	public void testaAloMundo() {
		AloMundo msg = new AloMundo("Ola!!");
		assertEquals("Ola!!", msg.getMensagem());
	}
}
