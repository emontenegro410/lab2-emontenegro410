package edu.luc.cs.cs271.lab2;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestTeam {
  
  Team makeTeamFixture(final String name, final String headcoach, final int funding) {
    return new Team(name, headcoach, funding);
  }

  @Test
  public void testConstructorValidName() {
    try {
      new Team(null, "Klinsmann", 500);
      fail("should have thrown IllegalArgumentException");
    } catch (final Throwable ex) {
      // if we landed here, we're good!
    }
  }


// Done TODO testConstructorValidHeadcoach
  @Test
  public void testConstructorValidHeadcoach(){
    try {
      new Team("USA", null, 500);
      fail("should have thrown IllegalArgumentException");
      } catch(final Throwable ex){
        //if we landed here, we're good!
    }
  }

  // Done TODO testConstructorValidFunding
  @Test
  public void testConstructorValidFunding(){
    try {
      new Team("USA", "Klinsmann", -1);
      fail("should have thrown IllegalArgumentException");
    }catch (final Throwable ex){
      //if we landed here, we're good!
    }
  }
  
  
  @Test
  public void testGetName() {
    final String name = "USA";
    final Team t = makeTeamFixture(name, "Klinsmann", 500);
    assertEquals(name, t.getName());
  }

  // Done TODO testGetHeadcoach
  @Test
  public void testGetCoach() {
    final String coach = "Klinsmann";
    final Team t = makeTeamFixture("USA", coach, 500);
    assertEquals(coach, t.getHeadcoach());
  }

  // Done TODO testGetFunding
  @Test
  public void testGetFunding() {
    final int funds = 500;
    final Team t = makeTeamFixture("USA", "Klinsmann", funds);
    assertEquals(funds, t.getFunding());
  }
}