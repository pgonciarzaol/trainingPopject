Feature: Viewing front page of gazeta portal
  Scenario: As a user I want to see landing page of gazeta
    Given I opened gazeta landing site
    When I click on accept cookie button
    Then I validate that header site elements are available