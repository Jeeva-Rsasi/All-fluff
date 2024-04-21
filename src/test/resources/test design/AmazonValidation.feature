Feature: Amazon homepage validation

  Scenario: search functionality
    Given user navigates to Amazon home page
    When user enter the "<src>", "<dest>", "<src_airport>" and "<dst_airport>" in search box.
    Then verify the search result

    Examples:
      | src           | dest        | src_airport | dst_airport |
      | San Francisco | Atlanta     | SFO         | ATL         |
      | Seattle       | Los Angeles | SEA         | LAX         |