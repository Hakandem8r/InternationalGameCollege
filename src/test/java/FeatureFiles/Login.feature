Feature: Click Functioanlity

  Scenario: About us and mission and vision steps

    Given Navigate to igamecollege
    And  Click corporate button
    When Click About Us button verify about us title
    Then Verify url "https://igamecollege.com/corporate/about-us/"
    Then Click Mission and Vision

  Scenario: Contact steps
    Given click contactFirst
    And click contactSecond
    And given the name
    And given the email
    And given the subject
    And given the message
    Then click submit button
    Then see the last message