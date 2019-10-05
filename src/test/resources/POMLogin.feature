Feature: GuruBank live Guru Test

  Scenario: To test user should be able to sort product by their names
    Given user is on Home Page
    And user verify Home Page title
    When I click on  MOBILE link
    Then user verify seeing  mobile title
    Then user select name in SORTBY dropdown menu
    Then user verify all three products are sorted by name

  Scenario: To compare and verify that the product page in list and detail page are equal
    Given user is on Home Page
    And user verify Home Page title
    When I click on  MOBILE link
    Then user reads the cost of Sony Xperia
    And user clicks on Sony Xperia mobile
    Then user confirm he is on Sony Xperia mobile Page
    Then user confirm the price of Sony Xperia in Sony Xperia mobile Page is $100

  Scenario: To verify that user cannot add more product in cart than the product available in store
    Given user is on Home Page
    And user verify Home Page title
    When I click on  MOBILE link
    Then user click on Add To Cart button for Sony Xperia
    And user click on the quantity text box
    And user enters 1000 as quantity
    And user clicks on update button
    Then user should verify seeing an error message
    Then user should click on Empty Cart link in the footer of list of all mobile
    And user verify that the cart is empty

  Scenario: To verify that user is able to compare two products
    Given user is on Home Page
    And user verify Home Page title
    When I click on  MOBILE link
    And user clicks on Add To Compare on IPhone link
    And user also clicks on Add To Compare on Samson Galaxy
    Then user clicks on Compare button
    Then user verify selected products on for pop up window
    And user closes the Pop up window
