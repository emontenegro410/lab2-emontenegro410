package edu.luc.cs.cs271.lab2;

import java.util.List;
import java.util.Optional;

public class Search {

  /** Looks for the position of the named team in an array. */
  public static Optional<Integer> findTeamPosition(final Team[] arr, final String key) {
    // Gets the array size
    final int size = arr.length;
    // Runs through a for loop to check
    for (int i = 0; i < size; i++) {
      // Gets the current item at index and compare name to key
      if (arr[i].getName().equals(key)) {
        // Return the index of where the item with key is located
        return Optional.of(i);
      }
    }
    // If it does not exist in the array then return an index of -1
    return Optional.empty();
  }

  /** Looks for the position of the named team in a list. */
  public static Optional<Integer> findTeamPosition(final List<Team> list, final String key) {
    // DONE TODO complete this method
    // This is to get the list size
    final int size = list.size();
    // Runs through a for loop to check
      for (int i=0; i<size; i++) {
        // Gets the current item at index and compare name to key
        if (list.get(i).getName().equals(key)) {    
          //Return the index where the item with key is located
          return Optional.of(i);
        }
      }
    return Optional.empty();
  }
  
  /** 
   * Looks for the position of the poorest team that has at least 
   * the specified funding level.
   * @pre arr is sorted
   * @post arr[result].funding >= minFunding && for all 0 <= i < result : arr[i].funding < minFunding
   */
   public static Optional<Integer> findTeamMinFunding(final Team[] arr, final int minFunding) {
    // DONE TODO complete this method
    final int size = arr.length;
    // Runs through a for loop to check
    for(int i =0; i< size; i++) {
        if(arr[i].getFunding() >= minFunding) {
           return Optional.of(i);
          }
        }
    return Optional.empty();
  }
  
  /** 
   * Looks for the position of the poorest team that has at least 
   * the specified funding level. 
   * Uses binary search: Initially search the entire array, 
   * then repeatedly eliminate the wrong half of the array until 
   * zero or one items are left.
   * @pre arr is sorted
   * @post arr[result].funding >= minFunding && for all 0 <= i < result : arr[i].funding < minFunding
   */
  public static Optional<Integer> findTeamMinFundingFast(final Team[] arr, final int minFunding) {
    // TODO complete this method
    // Gets the array size
    final int size = arr.length;
    // Initially search the entire array
    int low = 0;
    int high = size - 1;
    // Keep going as long as there is more than one item to be checked
    while(low <= high) {
      final int mid = (low+high)/2;
        // Eliminate the wrong half of the array
        // Return current item only if it meets the condition!
    if (low <= high && arr[low].getFunding() >= minFunding) {
      return Optional.of(low);
    }
    else if (arr[low].getFunding() < minFunding && arr[mid].getFunding() < minFunding) {
  
              low = mid + 1;
    }
    else {
      high=mid;
    }
  }
   return Optional.empty();
  }
}
  //Make sure last one works