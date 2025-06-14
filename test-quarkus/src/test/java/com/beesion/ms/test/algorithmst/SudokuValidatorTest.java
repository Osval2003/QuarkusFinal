package com.beesion.ms.test.algorithmst;

import com.beesion.ms.algorithms.SudokuValidator;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;  // <- JUnit 5
import static org.junit.jupiter.api.Assertions.assertTrue;  // <- JUnit 5

@QuarkusTest
public class SudokuValidatorTest {

    @Inject
    SudokuValidator validator;

    @Test
    public void testValidBoard() {
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'9','8','.','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        assertTrue(validator.isValid(board));
    }
}
