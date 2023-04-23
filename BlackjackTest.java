/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import org.junit.Test;

public class BlackjackTest {

    private Blackjack blackjack; // Remove static keyword

    @Test
    public void testGetName() {
        assertEquals("Blackjack", blackjack.getName());
    }

    @Test
    public void testPlayerAndComputerNotNull() {
        assertNotNull(blackjack.player);
        assertNotNull(blackjack.computer);
    }

    @Test
    public void testDeckNotNull() {
        assertNotNull(blackjack.deck);
    }

    @Test
    public void testPlay() {
        String input = "s\n"; // Player stands
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        //assertDoesNotThrow(() -> blackjack.play());
    }
}