Scenario:  No change
Given the available banknotes are: 100, 50, 20, 10, 5, 2, 1
When I purchase item with price: 1 and 1
Then change is:

Scenario:  Change is: 50, 20, 10, 5
Given the available banknotes are: 50, 20, 10, 5
When I purchase item with price: 215 and 300
Then change is: 50, 20, 10, 5