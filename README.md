## D287 – JAVA FRAMEWORKS

## PART C
Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.

-changed the title of the webpage to "Ryan's Mechanical Keyboard Shop" in the mainscreen.html file on line 17\
-changed the header of the webpage to "Ryan's Mechanical Keyboard Shop" in the mainscreen.html file on line 22\
-created a CSS file called styles.css under the css directory and linked it to mainscreen.html on line 15\
-in styles.css I centered the "container" div on line 3\
-changed the background color to dark grey on line 2 in styles.css

## PART D
Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.

-created an about.html file in the templates directory\
-changed the title of the "About" page in about.html on line 9\
-added a header of the "About" page in about.html on line 13\
-added a "Who We Are" section on the "About" page in about.html on lines 16-17\
-added a "Our Mission" section on the "About" page in about.html on lines 20-21\
-added a "Contact Us" section on the "About" page in about.html on lines 24-25\
-added a "Back to Home" button on the "About" page in about.html on line 27\
-created an AboutController.java class in the controller directory\
-added @Controller, @GetMapping, and the about method to AboutController.java to return the about.html page when requested on lines 6-13\
-added an "About" button in mainscreen.html on line 23\
-changed the background color, text alignment, and line spacing for the "About" page in the styles.css file on lines 1-4 and 6-8\

## PART E
Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.


## PART F
Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
•  The “Buy Now” button must be next to the buttons that update and delete products.
•  The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
•  Display a message that indicates the success or failure of a purchase.

## PART G
Modify the parts to track maximum and minimum inventory by doing the following:
•  Add additional fields to the part entity for maximum and minimum inventory.
•  Modify the sample inventory to include the maximum and minimum fields.
•  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
•  Rename the file the persistent storage is saved to.
•  Modify the code to enforce that the inventory is between or at the minimum and maximum value.

## PART H
Add validation for between or at the maximum and minimum fields. The validation must include the following:
•  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
•  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
•  Display error messages when adding and updating parts if the inventory is greater than the maximum.

## PART I
Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.

## PART J
Remove the class files for any unused validators in order to clean your code.