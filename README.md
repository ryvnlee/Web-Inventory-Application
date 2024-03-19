## D287 – JAVA FRAMEWORKS

## PART C
Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.

-Changed the title of the webpage to "Ryan's Mechanical Keyboard Shop" in the mainscreen.html file on line 17\
-Changed the header of the webpage to "Ryan's Mechanical Keyboard Shop" in the mainscreen.html file on line 22\
-Created a CSS file called styles.css under the css directory and linked it to mainscreen.html on line 15\
-In styles.css I centered the "container" div on line 3\
-Changed the background color to dark grey on line 2 in styles.css

## PART D
Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.

-Created an about.html file in the templates directory\
-Changed the title of the "About" page in about.html on line 9\
-Added a header of the "About" page in about.html on line 13\
-Added a "Who We Are" section on the "About" page in about.html on lines 16-17\
-Added a "Our Mission" section on the "About" page in about.html on lines 20-21\
-Added a "Contact Us" section on the "About" page in about.html on lines 24-25\
-Added a "Back to Home" button on the "About" page in about.html on line 27\
-Created an AboutController.java class in the controller directory\
-Added @Controller, @GetMapping, and the about method to AboutController.java to return the about.html page when requested on lines 6-13\
-Added an "About" button in mainscreen.html on line 23\
-Changed the background color, text alignment, and line spacing for the "About" page in the styles.css file on lines 1-4 and 6-8

## PART E
Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.

-Added 5 sample parts(switches, keycaps, cases, pcbs, stabilizers) in the BootStrapData.java file on lines 42-86\
-Added 5 sample products(full-size keyboard, TKL keyboard, 75%, 60%, 40%) in the BootStrapData.java file on lines 106-115

## PART F
Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
•  The “Buy Now” button must be next to the buttons that update and delete products.
•  The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
•  Display a message that indicates the success or failure of a purchase.

-Created a "Buy Now" button in mainscreen.html on line 91\
-Created the BuyNowController.java file in the controllers directory\
-Added the @Controller to the BuyNowController class in BuyNowController.java on line 12\
-Created the "productRepository" variable and added the @Autowired annotation in BuyNowController.java on lines 15-16\
-Created the "buyNow" method and annotated with @GetMapping in BuyNowController.java on lines 18-37\
-Created the purchasesuccess.html file in the templates directory\
-Created the purchaseerror.html file in the templates directory\
-Added a "Purchase success" message in purchasesuccess.html on lines 16-17\
-Added a "Back to Home" button in purchasesuccess.html on line 19\
-Added a "Purchase error" message in purchaseerror.html on lines 16-17\
-Added a "Back to Home" button in purchaseerror.hml on line 19

## PART G
Modify the parts to track maximum and minimum inventory by doing the following:
•  Add additional fields to the part entity for maximum and minimum inventory.
•  Modify the sample inventory to include the maximum and minimum fields.
•  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
•  Rename the file the persistent storage is saved to.
•  Modify the code to enforce that the inventory is between or at the minimum and maximum value.

-Added the "Max Inventory" and "Min Inventory" headers to the table in mainscreen.html on lines 42-43\
-Added the "tempPart.maxInv" and "tempPart.minInv" data to the table in mainscreen.html on lines 52-53\
-Declared "maxInv" variable and used @Min annotation in Part.java on lines 31-32\
-Declared "minInv" variable and used @Min annotation in Part.java on lines 33-34\
-Added constructors for the "maxInv" variable in Part.java on lines 48 and 57\
-Added constructors for the "minInv" variable in Part.java on lines 49 and 58\
-Added getters for the "maxInv" and "minInv" variable in Part.java on lines 93 and 97\
-Added setters for the "maxInv" and "minInv" variable in Part.java on lines 95 and 99\
-Created "isValidInventory" method in Part.java on lines 127-129\
-Created a conditional statement using "isValidInventory" method to generate error message for invalid inventory in AddInhousePartController.java on lines 43-46\
-Created a conditional statement using "isValidInventory" method to generate error message for invalid inventory in AddOutsourcedPartController.java on lines 44-47\
-Added max and min inventory values for each of my sample parts inventory in BootStrapData.java on lines 48-49, 57-58, 66-67, 75-76, and 84-85\
-Added additional text inputs for both max and min inventory values in InhousePartForm.html on lines 29-33\
-Added additional text inputs for both max and min inventory values in OutsourcedPartForm.html on lines 30-34\
-Added "Back to Home" button in InhousePartForm.html on line 39\
-Added "Back to Home" button in OutsourcedPartForm.html on line 39\
-Renamed the file the persistent storage is saved to "database" in application.properties on line 6

## PART H
Add validation for between or at the maximum and minimum fields. The validation must include the following:
•  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
•  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
•  Display error messages when adding and updating parts if the inventory is greater than the maximum.

-Created the "lowerBounds" method to check if value is at the minimum inventory value in Part.java on lines 131-133\
-Created the "upperBounds" method to check if value is at the maximum inventory value in Part.java on lines 135-137\
-Created a conditional statement using the "lowerBounds" method to validate if inventory amounts in AddInhousePartController.java on lines 48-51\
-Created a conditional statement using the "upperBounds" method to validate if inventory amounts in AddInhousePartController.java on lines 53-56\
-Created a conditional statement using the "lowerBounds" method to validate if inventory amounts in AddOutsourcedPartController.java on lines 49-52\
-Created a conditional statement using the "upperBounds" method to validate if inventory amounts in AddOutsourcedPartController.java on lines 54-57\
-Edited the error message to be more accurate in ValidEnufParts.java on line 20\
-Added a conditional statement that checks that the part inventory does not fall below minimum when buying a creating a product in EnufPartsValidator.java on line 36

## PART I
Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.

-Added a unit test using the "upperBounds" method and passed in PartTest.java on lines 160-167\
-Added a unit test using the "lowerBounds" method and passed in PartTest.java on lines 169-176

## PART J
Remove the class files for any unused validators in order to clean your code.

-Removed the DeletePartValidator.java class as it was not used