### Stream API tasks

#### 1. stream Basics and Map Transformation [5-6mins]
    - Print all item IDs in the inventory using `map()`
    - Create a list of item names in lowercase and print it
    - Generate a list of the lengths of item names


#### 2. Filtering and Matching [5-6mins]
    - Find all items priced above 1000 and print their names
    - Check if any item has a quantity of 0 using `anyMatch`
    - Verify that all items have a price greater than 0 using      `allMatch`
    - Confirm that no item has a negative quantity using noneMatch


#### 3. Combined Stream Operations [5-6mins]
    - Perform the following in a single stream pipeline:
        - Filter items with price > 1000 and quantity > 0.
        - Extract item names.
        - Remove duplicates.
        - Sort names alphabetically.
        - Limit to top 5 results.
        - Collect into a list and print.


### Reduce Function in Stream API tasks

#### 4. Reduce for Aggregation
    - Calculate the total quantity of all items in the inventory [5-6mins].
        - Total Quantity accross items.
    - Find the most expensive item using `reduce()` [5-6mins]
    - Concatenate all item names into a comma-separated string [5-6mins]


#### 5. Custom Exceptions
    - Create and use custom exceptions for domain-specific errors.
