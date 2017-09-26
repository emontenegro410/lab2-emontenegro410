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


      
  @Test
  public void testFindPositionList0(){
    final ArrayList<Team> list = makeListFixture(0);
    assertFalse(Search.findTeamPosition(list, "Team 5").isPresent());
  }
  
  
  @Test
  public void testFindPositionList10s(){
    final ArrayList<Team> list = makeListFixture(10);
    assertTrue(Search.findTeamPosition(list, "Team 5").isPresent());
  }

  @Test
  public void testFindPositionList10f(){
    final ArrayList<Team> list = makeListFixture(10);
    assertFalse(Search.findTeamPosition(list, "Team 11").isPresent());
  }
  
  // Done TODO: testFindMinFundingArray for several sizes and scenarios
 @Test
  public void testFindMinFundingArray50() {
    final int funding = 50;
    final Team[] arr = makeArrayFixture(1);
    assertTrue(Search.findTeamMinFunding(arr, funding).isPresent());
  }
  
  @Test
  public void testFindMinFundingArray150() {
    final int funding = 150;
    final Team[] arr = makeArrayFixture(2);
    assertTrue(Search.findTeamMinFunding(arr, funding).isPresent());
  }
  
  @Test
  public void testFindMinFundingArray200() {
    final int funding = 200;
    final Team[] arr = makeArrayFixture(1);
    assertFalse(Search.findTeamMinFunding(arr, funding).isPresent());
  }



  // Done TODO: testFindMinFundingArrayFast for several sizes and scenarios

  @Test
  public void testFindMinFundingFastArraySimple(){
    final Team[] arr = makeArrayFixture(10);
    assertEquals(Optional.ofNullable(2), Search.findTeamMinFundingFast(arr, 250));
  }

  @Test
  public void testFindMinFundingFastArrayLong(){
    final Team[] arr = makeArrayFixture(100);
    assertEquals(Optional.ofNullable(25), Search.findTeamMinFundingFast(arr, 2500));

  }

  @Test
  public void testFindMindFundingFastArrayFailed(){
    Team[] arr = makeArrayFixture(3);
    assertEquals(Optional.empty(), Search.findTeamMinFundingFast(arr, 350));
  }

}