Feature: Signin using different users
  Scenario Outline: Each user name should be unique
    Given I click on signin button
    When I enter "<username>" and "<password>"
    Then I should see "<username>" as the user
    And I logout
    Examples:
      | username | password |
      | demouser | testingisfun99 |
#      | fav_user | testingisfun99 |
#      | locked_user | testingisfun99 |
