Requirements:

Application should allow user onboarding. add_user(user_detail)

Add basic user details add_vehicle(vehicle_detail)

Add the user’s vehicle(s) details

User should be able to offer a shared ride on a route with details. offer_ride(ride_detail)

Ride will have details like vehicle, origin, destination, available seats. (A ride will have no intermediate stops.)

Users can select a ride from multiple offered rides using a selection strategy. (A user can only request a ride (only for 1 or 2 people)) select_ride(source, destination, seats, selection_strategy) Prefered Vehicle (Activa/Polo/XUV) Most Vacant.

System should be able to end the ride. User can only offer a ride for a given vehicle, once there are no active offered rides for that vehicle. end_ride(ride_details)

Find total rides offered/taken by all users. print_ride_stats()