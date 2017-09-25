package edu.luc.cs.cs271.lab2;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestSearch {
  
  Team[] makeArrayFixture(final int size) {
    final Team[] array = new Team[size];
    for (int i = 0; i < size; i++) {
      final String s = Integer.toString(i);
      array[i] = new Team("Team " + s, "Coach " + s, i * 100 + 50);
    }
    return array;
  }

  // TODO makeListFixture
  
    List<Team> makeListFixture(final int size) {
    final Team[] array = new Team[size];
    final List<Team> list = Arrays.asList(array);
       for (int i = 0; i < size; i++) {
         final String s = Integer.toString(i);
            array[i] = new Team("Team " + s, "Coach " + s, i * 100 + 50);
         }
    return list;
  }
  

 // Done TODO: testFindPositionList0, 10s, 10f
    @Test
  public void testFindPositionList0() {
    final List<Team> = makeListFixture(0);
    assertFalse(Search.findTeamPosition(List, "Team 2").isPresent()); //similar search to array 
  }

  @Test
  public void testFindPositionList10s() {
    final List<Team> = makeListFixture(10);
    assertTrue(Search.findTeamPosition(List, "Team 5").isPresent());
  }

  @Test
  public void testFindPositionList10f() {
    final List <Team>= makeListFixture(10);
    assertFalse(Search.findTeamPosition(List "Team 10").isPresent());
  }
  
  // Done testFindMinFundingArray for several sizes and scenarios
     @Test
  public void testFindMinFundingArray0() {
    final Team[] arr = makeArrayFixture(0);
    assertFalse(Search.findTeamMinFunding(arr, 7).isPresent());
  }
  
   @Test
  public void testFindMinFundingArray10s() {
    final Team[] arr = makeArrayFixture(10);
    assertTrue(Search.findTeamMinFunding(arr, 25).isPresent());
  }
  
   @Test
  public void testFindMinFundingArray10f() {
    final Team[] arr = makeArrayFixture(10);
    assertFalse(Search.findTeamMinFunding(arr, 50).isPresent());
  }

  // Done TODO: testFindMinFundingArrayFast for several sizes and scenarios

   @Test
  public void testFindMinFundingArrayFast0() {
    final Team[] arr = makeArrayFixture(0);
    assertFalse(Search.findTeamMinFundingFast(arr, 500).isPresent());
  }

  @Test
  public void testFindMinFundingArrayFast10s() {
    final Team[] arr = makeArrayFixture(10);
    assertTrue(Search.findTeamMinFundingFast(arr,500).isPresent());
  }

  @Test
  public void testFindMinFundingArrayFast10f() {
    final Team[] arr = makeArrayFixture(10);
    assertFalse(Search.findTeamMinFundingFast(arr, 1000).isPresent());
  }
}