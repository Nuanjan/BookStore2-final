<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/bookCatalog.css">
<meta charset="ISO-8859-1">
<title>Book List</title>
</head>

<h1 align="center" style="color: white">Book Shelves</h1>

<p>
<p>
<a href="WebContent/Shopp.jsp" mce_href="ShoppingCart.jsp"><a href="#">
          <span class="glyphicon glyphicon-shopping-cart"></span>
        </a></a>
        </p>


<form method = "post" action ="CustomerServlet">
<ul class="products">
    <li>
    	
        <img src="https://s1.nyt.com/du/books/images/9780399180194.jpg">
        <a href="#" style="color:#2b2d2f"> 
        <input type="hidden" name="title" value="TWISTED TWENTY-SIX"/>   
            <h4>TWISTED TWENTY-SIX</h4>
            <p>Janet Evanovich</p>
            <p>6.99</p><input type="hidden" name="price" value="6.99"><input type="hidden" name="price" value="100">
            <p><font size="2"><strong>Quantity</strong>: </font></p>
           <input type="submit" name="addToCart1" value="Add To Cart">
        </a>
       
    </li>
    <li>
    
        <img src="https://s1.nyt.com/du/books/images/9780399593543.jpg">
        <a href="#" style="color:#2b2d2f">  
        <input type="hidden" name="title" value="BLUE MOON"/>  
            <h4>BLUE MOON</h4>
            <p>Lee Child</p><input type ="hidden" name ="writter" value ="1"/>
            <p>8.59</p><input type="hidden" name="price" value="8.59"><input type="hidden" name="price" value="100">
            <p><font size="2"><strong>Quantity</strong>: <input type="text" size="2" value="1" name="quantity"></font></p><input type="hidden" name="action" value="add">
            <input type="submit" name="addToCart2" value="Add To Cart">
        </a>
        
    </li>
    <li>
   
        <img src="https://s1.nyt.com/du/books/images/9780385544184.jpg">
        <a href="#" style="color:#2b2d2f"> 
        <input type="hidden" name="title" value="THE GUARDIANS"/>   
            <h4>THE GUARDIANS</h4>
            <p>John Grisham</p>
            <p>5.99</p>
            <p><font size="2"><strong>Quantity</strong></font></p>
            <input type="submit" name="addToCart3" value="Add To Cart">
        </a>
        
    </li>
    <li>
   
        <img src="https://s1.nyt.com/du/books/images/9780735219090.jpg">
        <a href="#" style="color:#2b2d2f"> 
        <input type="hidden" name="title" value="WHERE THE CRAWDADS SING"/>   
            <h4>WHERE THE CRAWDADS SING</h4>
            <p>Delia Owens</p>
            <p>6.99</p>
            <p><font size="2"><strong>Quantity</strong></font></p>
            <input type="submit" name="addToCart4" value="Add To Cart">
        </a>
        
    </li>
    <li>
   
        <img src="https://s1.nyt.com/du/books/images/9780316485616.jpg">
        <a href="#" style="color:#2b2d2f">
           <input type="hidden" name="title" value="WHERE THE CRAWDADS SING"/>
            <h4>THE NIGHT FIRE</h4>
            <p> Michael Connelly</p>
            <p>7.19</p>
            <p><font size="2"><strong>Quantity</strong></font></p>
            <input type="submit" name="addToCart5" value="Add To Cart">
        </a>
        
    </li>
    <li>
   
        <img src="https://s1.nyt.com/du/books/images/9781546086031.jpg">
        <a href="#" style="color:#2b2d2f">   
        <input type="hidden" name="title" value="TRIGGERED"/> 
            <h4>TRIGGERED</h4>
           
            <p> Donald Trump Jr.</p>
            <p>5.99</p>
            <p><font size="2"><strong>Quantity</strong>: </font></p>
            <input type="submit" name="addToCart6" value="Add To Cart">
        </a>
         
    </li>
    <li>
  
        <img src="https://s1.nyt.com/du/books/images/9780316478526.jpg">
        <a href="#" style="color:#2b2d2f"> 
        <input type="hidden" name="title" value="TALKING TO STRANGERS"/>   
            <h4>TALKING TO STRANGERS</h4>
            <p>Malcolm Gladwell</p>
            <p>8.19</p>
            <p><font size="2"><strong>Quantity</strong>:</font></p>
           <input type="submit" name="addToCart7" value="Add To Cart">
        </a>
        
    </li>
    <li>
    
        <img src="https://s1.nyt.com/du/books/images/9780525540533.jpg">
        <a href="#" style="color:#2b2d2f">    
        <input type="hidden" name="title" value="SAM HOUSTON AND THE ALAMO AVENGERS"/>
            <h4>SAM HOUSTON AND THE ALAMO AVENGERS</h4>
            <p>Brian Kilmeade</p>
            <p>7.59</p>
            <p><font size="2"><strong>Quantity</strong>: </font></p>
            <input type="submit" name="addToCart8" value="Add To Cart">
        </a>
       
    </li>
    <li>
   
        <img src="https://s1.nyt.com/du/books/images/9781250266552.jpg">
        <a href="#" style="color:#2b2d2f">
        <input type="hidden" name="title" value="WITH ALL DUE RESPECT"/>    
            <h4>WITH ALL DUE RESPECT</h4>
            <p>Nikki R. Haley</p>
            <p>5.89</p>
            <p><font size="2"><strong>Quantity</strong>: </font></p>
            <input type="submit" name="addToCart9" value="Add To Cart">
        </a>
         
    </li>
    <li>
  
        <img src="https://s1.nyt.com/du/books/images/9780062952394.jpg">
        <a href="#" style="color:#2b2d2f"> 
        <input type="hidden" name="title" value="FINDING CHIKA"/>
            <h4>FINDING CHIKA</h4>
            <p>Mitch Albom</p>
            <p>4.99</p>
            <p><font size="2"><strong>Quantity</strong>: </font></p>
            <input type="submit" name="addToCart10" value="Add To Cart">
        </a>
        
    </li>
    <li>
   
        <img src="https://s1.nyt.com/du/books/images/9780393635522.jpg">
        <a href="#" style="color:#2b2d2f">  
         <input type="hidden" name="title" value="THE OVERSTORY"/>
            <h4>THE OVERSTORY</h4>
            <p>Richard Powers</p>
            <p>7.49</p>
            <p><font size="2"><strong>Quantity</strong>: </font></p>
            <input type="submit" name="addToCart11" value="Add To Cart">
        </a>
        
    </li>
    <li>
   
        <img src="https://s1.nyt.com/du/books/images/9781538728529.jpg">
        <a href="#" style="color:#2b2d2f">  
        <input type="hidden" name="title" value="EVERY BREATH"/>
            <h4>EVERY BREATH</h4>
            <p>Nicholas Sparks</p>
            <p>6.89</p>
            <p><font size="2"><strong>Quantity</strong>: </font></p>
            <input type="submit" name="addToCart12" value="Add To Cart">
        </a>
        
    </li>
    <li>

        <img src="https://s1.nyt.com/du/books/images/9780316530002.jpg">
        <a href="#" style="color:#2b2d2f">  
        <input type="hidden" name="title" value="THE CHEF"/>  
            <h4>THE CHEF</h4>
            <p>James Patterson and Max DiLallo</p>
            <p>7.69</p>
            <p><font size="2"><strong>Quantity</strong>: </font></p>
            <input type="submit" name="addToCart13" value="Add To Cart">
        </a>
         
    </li>
    <li>

        <img src="https://s1.nyt.com/du/books/images/9781586422479.jpg">
        <a href="#" style="color:#2b2d2f">  
        <input type="hidden" name="title" value="I HEARD YOU PAINT HOUSES"/>
            <h4>I HEARD YOU PAINT HOUSES</h4>
            <p>Charles Brandt</p>
            <p>8.19</p><input type="hidden" name="price" value="8.19">
            <p><font size="2"><strong>Quantity</strong>: </font></p>
            <input type="submit" name="addToCart14" value="Add To Cart">
        </a>
        
    </li>
    <li>
    
        <img src="https://s1.nyt.com/du/books/images/9780670785933.jpg">
        <a href="#" style="color:#2b2d2f"> 
        <input type="hidden" name="title" value="THE BODY KEEPS THE SCORE"/>   
            <h4>THE BODY KEEPS THE SCORE</h4>
            <p>Bessel van der Kolk</p>
            <p>5.99</p>
            <p><font size="2"><strong>Quantity</strong>: </font></p>
            <input type="submit" name="addToCart15" value="Add To Cart">
        </a>
         
    </li>
    
</ul>
</form>
		

</body>
</html>