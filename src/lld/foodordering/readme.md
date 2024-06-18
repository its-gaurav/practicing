
- System has a tie-up with restaurants, where each restaurant has a menu with all the items & their prices.
- Restaurants also have a rating feature which could be given from 1 to 5.
- Every restaurant has max # number of orders it can process at any given time. Beyond that, it shouldn’t be assigned any new orders until an ongoing order is completed.
- Once an order is ACCEPTED, the restaurant can mark it as COMPLETED when the order is ready. This will free up the processing capacity of the restaurant.
- Note:- A restaurant can’t CANCEL an ACCEPTED order.
- Order will be auto-assigned to a restaurant based on selection criteria.
- Eg: Assign by lowest cost or best rating.
- Order will be auto-assigned to a restaurant only if all the items in an order can be fulfilled by a single restaurant. Else the order will not be ACCEPTED.

Requirements

- A new restaurant can be onboarded with a menu.
- A customer should be able to place an order by giving items, respective quantities & selection criteria.
- Restaurants can mark ACCEPTED orders as COMPLETED. Orders once ACCEPTED can’t be CANCELLED by a restaurant.
- Order will be auto-assigned to a restaurant based on a selection criteria.
- Implement at least one restaurant selection criteria.
- A restaurant should be able to update its menu. For simplicity, a restaurant can't delete an item from the menu. Note:- Do not use any database or NoSQL store, use an in-memory store.

Assumptions:

- Unique restaurant name 
- No need to create the user.