package org.example.controllers;

import org.example.studycards.CardManager;
import org.junit.jupiter.api.*;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.io.*;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class StudyCardsControllerTest {
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
    private CardManager manager = CardManager.getCardManager();
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() throws UnsupportedEncodingException {
        PrintStream streamFlux = new PrintStream(output, true, "UTF-8");
        System.setOut(new PrintStream(outputStreamCaptor));
        System.setOut(streamFlux);
    }

    @AfterEach
    public void cleanUp()  {
        output.reset();
    }

    @Test
    @DisplayName("Get Controller Options")
    @Order(1)
    public void verifyControllerOptions() {
        StudyCardsController.controllerOptions();

        assertTrue(output.toString().contains("return"));
        assertTrue(output.toString().contains("view cards"));
        assertTrue(output.toString().contains("create card"));
        assertTrue(output.toString().contains("delete card"));
        assertTrue(output.toString().contains("(FlashCard) Get random card"));
        assertTrue(output.toString().contains("(Leitner) Insert card in box"));
        assertTrue(output.toString().contains("(Leitner) Remove card from box"));
        assertTrue(output.toString().contains("(Leitner) Upgrade card from box"));
        assertTrue(output.toString().contains("(Leitner) Downgrade card from box"));
    }

    @Test
    @DisplayName("Testing output of system out")
    @Order(1)
    public void systemOutTest() {
    }



}