package com.au.gov.service;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChildrenGameServiceTest {

    private ChildrenGameService childrenGameService = new ChildrenGameServiceImpl();

    @Test
    public void testLastRemainingWith10() {
        int remainingChild = childrenGameService.playGame(10, 3);
        assertEquals(remainingChild, 4);
    }

    @Test
    public void testLastRemainingWith100() {
        int remainingChild = childrenGameService.playGame(100, 9);
        assertEquals(remainingChild, 82);
    }
}
