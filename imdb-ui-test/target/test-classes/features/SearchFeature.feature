
Feature: Search Series

   Scenario Outline: Title of your scenario outline
    Given Navigate to Imdb home page
    When Search '<series>'
    And Click first result
    Then Check actual name is equal to '<series>'
    Then Check actual year is equal to '<year>'

    Examples: 
      | series  | year | 
      |The Office|2005-2013| 
		  |Anne|2017-2019|
		  |Dead to Me|2019-2022|  