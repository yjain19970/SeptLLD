This lab session will mainly be focusing on these topics:

1. Generics
2. Collections
3. Comparable + Comparator
    For these concepts we are going to build an Inventory Management System.



### Milestone-1
In this milestone we will ensure that we implement the Item class and further sub-categoris of it.

InventoryManagementSystem.
    Items
     * id
     * name
     * price
     * quantity
        - (subitems) Electronics
        - (subitems) Book
        - (subitems) Clothing

-> Comparable in the Items class which sorts the list on basis of Price.

 > 7 Mins




### Milestone-2
Implement a generic Inventory system for managing items.
    - Invetory class. Which takes all types of Items and its sub classes.
    - Maintain, an Inventory here. 
        Map<String,T> --> T can be anything (which is an Item)


        - Add(T)
        - Remove(id)
        - List<T> GetAll()



### Milestone-3
Implement a list of Items for keeping recently viewed Items.
    - Ensure the size of List does not exceed `X`. If it does, delete the LAST/OLDEST item.
    - Always add new item (recently viewed) on FRONT.

    - RecentlyViewedItems
        -


        - AddRecentlyViewedItems() 
            - If SIZE > MAX_SIZE, then remove last from item. 
            - Add any items to front of the QUEUE.
            







### Milestone-4
Implement OrderProcessing by giving Priority to some orders
    - Order class.
    - Implement PQ for Order --> which has `orderId` and `isExpress` attributes.
    - In OrderProcessor class --> Add methods: `addOrder` `processOrder` 


### Milestone-5
Enable sorting and filtering of items on different criteria.
    - Write custom comparators here.
    - Add Filtering capabilities.


### Difference between Comparable and Comparator:
Comparable defines a natural ordering and modifies the class itself with its `compareTo()` . This is particularly useful when you need a default way to compare and sort objects.

whereas Comparator provides a custom sorting logic using its `compare()` method. Comparable is in java.lang, while Comparator is in java.util. 

Both of them are used for sorting NonPritimive Objects in java.

#### Comparable

1. Purpose: Defines the natural, or default, ordering for objects of a specific class. 
2. Method: Uses the compareTo() method to define the sorting logic. 
3. Class Modification: Modifies the original class by implementing the interface. 
4. Sorting Sequences: Provides a single, default sorting sequence for the objects. 
5. Package: Part of the java.lang package. 
6. Use Case: Use when there is a clear, obvious natural ordering for a class and you control the class definition. 

#### Comparator


1. Purpose: Defines custom comparison logic for objects, separate from the object's class. 
2. Method: Uses the compare(Object o1, Object o2) method to define the sorting logic. 
3. Class Modification: Does not modify the original class; it's implemented by another class. 
4. Sorting Sequences: Allows for multiple, distinct sorting strategies. 
5. Package: Part of the java.util package. 
6. Use Case: Use when you need multiple sorting criteria or cannot modify the original class. 
