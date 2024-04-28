package com.sam.leetCodeString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoalParserInterpretationTest {

    @Test
    void interpret() {
        assertEquals("Goal", GoalParserInterpretation.interpret("G()(al)"));
        assertEquals("Gooooal", GoalParserInterpretation.interpret("G()()()()(al)"));
        assertEquals("alGalooG", GoalParserInterpretation.interpret("(al)G(al)()()G"));
    }
}