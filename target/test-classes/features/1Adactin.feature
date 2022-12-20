@tags
Feature: Checking the Booking Functionality of and Adaction Application

@tags1
Scenario Outline: Login Functionality
Given user Must Launch "http://adactinhotelapp.com/" In The Url Field
When user Enter The "<Username>" In The Username Field
And user Enter The "<Password>" In The Password Field
Then user Click The LoginButton and It Navigates To The Search Hoterl Page

@tags2
Examples:
|Username|Password|
|abcd|xyz|
|fdfc|abcd|
|harishvenkat|W18KU0|

@tags3
Scenario: Hotel Search Page Functionlity
When user Select The "London" On The Location DropDown
And user Select The "Hotel Sunshine" On The Hotel DropDown
And user Select The "Deluxe" On The Room Type DropDown
And user Select The "2 - Two" On The Number Of Room DropDown
And user Select The "2" On The Adult Per Room DropDown
And user Select The "1" On The Childern Per Room DropDown
Then user Click The SearchButton and It Navigate To The Hotel Search Page

@tags4
Scenario: Hotel A Hotel Functionality
When user Select The Hotel On The Select Hotel Field
Then user Click ContinueButton and It Navigates To The Book A Hotel Page

@tags5
Scenario: Book A Hotel Functionality
When user Enter "Santhosh" In The First Name Field
And user Enter The "kumar" In The Last Name Field
And user Enter The "8/81 Ramar Kovil st, porur, Chennai - 600098" In The Address Field
And user Enter The "4534543768128745" In The Credit Card Number Field
And user Enter The "VISA" In The Credit Card Type DropDown
And user Enter The "3" on The Expiry Month DropDowm
And user Enter The "2022" In The Expiry Year DropDowm
And user Enter The "0843" In The CVV Number Field
Then user Click The Book Now button and It Navigates To Booking Confirmation Page

@tags6
Scenario: Booking Confirmation Functionality
Then user Click LogOut button It Navigates To You Have Successfully Logged Out