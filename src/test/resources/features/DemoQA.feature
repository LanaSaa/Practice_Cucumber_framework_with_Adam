Feature: Verifying buttons feature of the application

  @buttons
  Scenario: Check different button actions
    Given Navigate to "Buttons" page
    When  Double click on button
    Then  Verify text double click message "You have done a double click" should be visible
    And   Right click on button
    Then  Verify text right click message "You have done a right click" should be visible
    And   Click Me button
    Then  Verify text click me message "You have done a dynamic click" should be visible