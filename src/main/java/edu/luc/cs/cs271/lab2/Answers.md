# LAB 2

## What is the complexity of each of the four search methods in terms of array or list size n?

- For both array and list"findTeamPosition" O(n) we use a linear search because it starts at the begining of the array/list. 
- For "findTeamPositionMinFunding" O(n) we also used a linear search (starts the search at the begining value and checks 1 by 1).
- For "findTeamMinFundingFast" O(log n) we used a binary search which means it starts the search at the middle value of the array if the middle value is not a match it will determine which side (if any) the correct value is at and eliminated the search on the other half.

## What happens in the case of binary search if the array is not sorted?

The binary search is inefficient. Binary search is used when we have a sorted list 
because it searches for the value wanted by starting the search in the middle. Due to the fact it starts the search in the middle the values have to be sorted/in order. 
If the value is higher than the middle then the search will continue from the middle value as the new low.

## What is the purpose of constructor argument validity checking?

The purpose is to check the parameters early on so that no errors could 
appear later when it will be harder to detect. 


## What is the purpose of using the keyword `final` with variables and arguments?

The purpose of "final" is to declare the value that is not subject to change/modifications. 
You are not allowed to change the reference and the compiler will show
a compilation error if you try to re-initialized final variables.


## What are alternatives to using `Optional` and how do they compare?

An alternative would be a conditional statements because it could check if the 
value is null or not. However this is differant from "Optional" because optional
allows the the value to be null or missing and create scenarios  
