package com.beesion.ms.test.algorithmst;

import com.beesion.ms.algorithms.SudokuValidator;
import jakarta.inject.Inject;

@QuarkusTest
public class SudokuValidatorTest {

    @Inject
    SudokuValidator validator;

    @Test
    public void testValidBoard() {
        char[][] board = {{'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                /* Completa con el resto del ejemplo válido */};
        assertTrue(validator.isValid(board));
    }
}
