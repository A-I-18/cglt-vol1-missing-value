package org.codinggym.lt;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.codinggym.lt.Solution.computeMissingValue;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void shouldOutputTwo() {
    //given
    int n = 10;
    List<Integer> values = Arrays.asList(10, 7, 4, 3, 5, 1, 9, 6, 8);

    int expected = 2;

    int actual = computeMissingValue(n, values);

    assertEquals(expected, actual);
  }

  @Test
  void shouldOutputSix() {
    //given
    int n = 6;
    List<Integer> values = Arrays.asList(5, 3, 4, 1, 2);

    int expected = 6;

    int actual = computeMissingValue(n, values);

    assertEquals(expected, actual);
  }

}