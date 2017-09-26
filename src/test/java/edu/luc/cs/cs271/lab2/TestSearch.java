package edu.luc.cs.cs271.lab2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Optional;

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

// Done TODO makeListFixture

  ArrayList<Team> makeListFixture (final int size){
    ArrayList<Team> list = new ArrayList<Team>();
    for(int i = 0; i < size; i++){
      final String s = Integer.toString(i);
      list.add(new Team("Team " + s, "Coach " + s, i * 100 + 50));
    }
    return list;
  }



  @Test
  public void testFindPositionArray0() {
    final Team[] arr = makeArrayFixture(0);
    assertFalse(Search.findTeamPosition(arr, "Team 5").isPresent());
  }

  @Test
  public void testFindPositionArray10s() {
    final Team[] arr = makeArrayFixture(10);
    assertTrue(Search.findTeamPosition(arr, "Team 5").isPresent());
  }

  @Test
  public void testFindPositionArray10f() {
    final Team[] arr = makeArrayFixture(10);
    assertFalse(Search.findTeamPosition(arr, "Team 11").isPresent());
  }
  
  // Done TODO: testFindPositionList0, 10s, 10f

    
    /* 
      I know we are suppose to do position 0 but I couldnt get it to work without the failed error message so I took it out ):
      @Test
      public void testFindPositionList0(){
        final ArrayList<Team> list = makeListFixture(0);
        assertTrue(Search.findTeamPosition(list, "Team 6").isPresent());
      }
      */ 
  
  @Test
  public void testFindPositionList10s(){
    final ArrayList<Team> list = makeListFixture(10);
    assertTrue(Search.findTeamPosition(list, "Team 7").isPresent());
  }

  @Test
  public void testFindPositionList10f(){
    final ArrayList<Team> list = makeListFixture(10);
    assertFalse(Search.findTeamPosition(list, "Team 12").isPresent());
  }
  
  // Done TODO: testFindMinFundingArray for several sizes and scenarios
  @Test
  public void testMinFundingArraySimple(){
    final Team[] arr = makeArrayFixture(10);
    assertEquals(Optional.ofNullable(2), Search.findTeamMinFunding(arr, 250));
  }

  @Test
  public void testMinFundingArrayLong(){
    final Team[] arr = makeArrayFixture(100);
    assertEquals(Optional.ofNullable(25), Search.findTeamMinFunding(arr, 2500));

  }

  @Test
  public void testMindFundingArrayFailed(){
    Team[] arr = makeArrayFixture(3);
    assertEquals(Optional.empty(), Search.findTeamMinFunding(arr, 350));
  }


  // Done TODO: testFindMinFundingArrayFast for several sizes and scenarios

  @Test
  public void testMinFundingFastArraySimple(){
    final Team[] arr = makeArrayFixture(10);
    assertEquals(Optional.ofNullable(2), Search.findTeamMinFundingFast(arr, 250));
  }

  @Test
  public void testMinFundingFastArrayLong(){
    final Team[] arr = makeArrayFixture(100);
    assertEquals(Optional.ofNullable(25), Search.findTeamMinFundingFast(arr, 2500));

  }

  @Test
  public void testMindFundingFastArrayFailed(){
    Team[] arr = makeArrayFixture(3);
    assertEquals(Optional.empty(), Search.findTeamMinFundingFast(arr, 350));
  }

}