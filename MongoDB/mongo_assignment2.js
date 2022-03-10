Atlanta Population
1. use db.zipcodes.find() to filter results to only the results where city is ATLANTA 
and state is GA.

use population

db.zipcodes.find({city:"ATLANTA",state:"GA"})

use db.zipcodes.aggregate with $match to do the same as above.
db.zipcodes.aggregate([{$match:{city:"ATLANTA",state:"GA"}}])

use $group to count the number of zip codes in Atlanta.
db.zipcodes.aggregate([{$match:{city:"ATLANTA"}},{$group:{_id:"$city",count:{$sum:1}}}])

use $group to find the total population in Atlanta.
db.zipcodes.aggregate([{$match:{city:"ATLANTA"}},{$group:{_id:"$city",count:{$sum:"$pop"}}}])


Populations By State
1. use aggregate to calculate the total population for each state
db.zipcodes.aggregate([{$group:{_id:"$state",TotPopulatTotPopulation:{$sum:"$pop"}}}])

sort the results by population, highest first
db.zipcodes.aggregate([{$group:{_id:"$state",TotPopulation:{$sum:"$pop"}}},{$sort:{TotPopulation:-1}}])

limit the results to just the first 3 results. What are the top 3 states in 
population?
population> db.zipcodes.aggregate([{$group:{_id:"$state",TotPopulation:{$sum:"$pop"}}},{$sort:{TotPopulation:-1}},{$limit:3}])


Populations by City
1. use aggregate to calculate the total population for each city (you have to use 
city/state combination). You can use a combination for the _id of the $group: { 
city: '$city', state: '$state' }
db.zipcodes.aggregate([{$group:{_id:"$city",TotPopulation:{$sum:"$pop"}}}])

2. sort the results by population, highest first
db.zipcodes.aggregate([{$group:{_id:"$city",TotPopulation:{$sum:"$pop"}}},{$sort:{TotPopulation:-1}}])

3. limit the results to just the first 3 results. What are the top 3 cities in 
population?
db.zipcodes.aggregate([{$group:{_id:"$city",TotPopulation:{$sum:"$pop"}}},{$sort:{TotPopulation:-1}},{$limit:3}])

4. What are the top 3 cities in population in Texas?
db.zipcodes.aggregate([{$match:{state:"TX"}},{$group:{_id:"$city",TotPopulation:{$sum:"$pop"}}},{$sort:{TotPopulation:-1}},{$limit:3}])

Bonus
1. Write a query to get the average city population for each state
db.zipcodes.aggregate([{$group:{_id:"$state",AvgPopulation:{$avg:"$pop"}}}])

2. What are the top 3 states in terms of average city population
db.zipcodes.aggregate([{$group:{_id:"$state",AvgPopulation:{$avg:"$pop"}}},{$sort:{AvgPopulation:-1}},{$limit:3}])
