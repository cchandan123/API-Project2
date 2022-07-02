Feature: Verify the User to login page, search hotel, select hotel, booking details, Booking id functionality in Adactin Hotel

  Scenario Outline: Booking Hotel By Selecting all fields
    Given User is on the AdactinLoginpage
    When User should enters the login Details "<Username>", "<password>"
    And User should verify "Hello cccchandan!"
    And User should fill the search Hotel "<location>","<hotels>","<roomtype>","<roomnos>","<checkin>","<checkout>","<adultroom>","<childroom>"
    And User should verify "Select Hotel" is Present
    And User select choose the Hotel
    And User should verify "Book A Hotel" is Present
    And User should enter the details of booking "<firstname>", "<lastname>", "<address>" , and payment
      | Credit CArd Type | Credit Card No   | Select month | Select Year | cvv  |
      | American Express | 8545458558585845 | June         |        2022 | 1234 |
      | Visa             | 8545458558581234 | June         |        2022 | 2452 |
      | MasterCard       | 8545458558584567 | June         |        2022 | 2587 |
      | Rupay            | 8545458558457825 | June         |        2022 | 6578 |
    Then User should verify "Booking Confirmation"

    Examples: 
      | Username   | password         | location | hotels      | roomtype | room nos | checkin    | checkout   | adultroom | childroom | firstname | lastname | address |
      | cccchandan | CCCChandan@#1234 | London   | Hotel Creek | Double   | 2-Two    | 25/05/2022 | 26/05/2022 | 2-Two     | 2-Two     | chandan   | chandan  | Bihar   |

  Scenario Outline: Booking Hotel Without entering any fields
    Given User is on the AdatinLoginpage
    When User should Perform login "<Username>", "<password>"
    And User should verify "Hello cccchandan!"
    And User search "<location>","<hotels>","<roomtype>","<roomnos>","<checkin>","<checkout>","<adultroom>","<childroom>"
    And User should verify "Select Hotel"
    And User should choose the Hotel
    And User should verify "Book A Hotel" is Present
    And User should click book
    Then User should verify " Please Enter your First Name","Please Enter you Last Name","Please Enter your Address","Please Enter your 16 Digit Credit Card Number","Please Select your Credit Card Type","Please Select your Credit Card Expiry Month" and "Please Enter your Credit Card CVV Number"

    Examples: 
      | Username   | password         | location | hotels      | roomtype | room nos | checkin    | checkout   | adultroom | childroom |
      | cccchandan | CCCChandan@#1234 | London   | Hotel Creek | Double   | 2-Two    | 25/05/2022 | 26/05/2022 | 2-Two     | 2-Two     |
