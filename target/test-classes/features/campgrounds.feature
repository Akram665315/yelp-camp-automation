Feature: campgrounds

  Scenario: all campgrounds are loaded
    Given user goes to campgrounds page
    And user can see all campgrounds are listed

  Scenario: create new campground
    Given user is logged in
    And go to campground page
    And create new campground
    Then verify a new campground is created

