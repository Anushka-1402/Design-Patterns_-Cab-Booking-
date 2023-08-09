# Design-Patterns_Cab Booking

This is a cab booking Application.<br>
The user selects the app to book the cab.<br>
The steps of cab booking are implemented by using <strong>Template Design Pattern</strong>. There is a template
for initialization, choosing the ride, payment mode, OTP verification, starting ride and end of the
ride. Within these methods:<br>
the chhoseRide method implements <strong>Factory Method Design Pattern</strong>, depending upon the type of
vehicle inputted by user, accordingly its Vehicle is instantiated by the VehicleFactory, and the
respective implementation continues.<br>
The verifyOTP method implements the <strong>Proxy Design Pattern</strong>, the OTP is firstly passed to a proxy
verifier, if valid then passed to actual verification implementation which indicates that OTP is
correct and then other methods are continued.<br>
