WIP 

# Purpose
The price calculator helps dungeon masters in various role playing games to use unified pricing system to in game costs across stories.  
For practicing purposes (so ignoring scope and performance needs for such a small project and leack of need for scalability) microservice infrastructure will be used, as well as different databases.

# Item Service
Item services relies on an sql db that stores item.  
An item has an id, a name, category, a minimum and maximum price.  
This service lts you handle base qualities of items. It will allow to collect individual and groups of items, modify, add, delete items. 

# Cart Service
The current cart items will be stored here, not in front end. 

# Pricecalculator Service
The service responsible for pricing

# Order Service
History of actual orders

# User Service
Handles DMs 
