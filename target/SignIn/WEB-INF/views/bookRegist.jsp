<html>
  <head>
    <title>BookRegist</title>
  </head>
  <body>
  <h1>Book Regist Page</h1>
  BookId : <input type="text" id="bookId"/><br/>
  BookName : <input type="text" id="bookName"/><br/>
  BookAuthor : <input type="text" id="bookAuthor"/><br/>
  price : <input type="text" id="price"/><br/>
  company : <input type="text" id="company"/><br/>
  category :
    <select id="category">
      <option value="" selected>--select--</option>
      <option value="novel">novel</option>
      <option value="history">history</option>
      <option value="history">science</option>
      <option value="essay">essay</option>
    </select>
  <input type="button" value="submit" id="registBtn"/>
  <input type="button" value="list" id="listBtn" onclick="location.href='/bookList';"/>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script type="text/javascript" src="/resources/js/bookRegist.js"></script>
  </body>
</html>
