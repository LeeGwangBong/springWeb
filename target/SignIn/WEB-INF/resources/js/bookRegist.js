$('#registBtn').click(function () {

    var bookId = $('#bookId').val();
    var bookName = $('#bookName').val();
    var bookAuthor = $('#bookAuthor').val();
    var price = $('#price').val();
    var company = $('#company').val();
    var category = $('#category').val();

    if(bookId=="") {
        alert("Write BookID");
        return;
    }

    if(bookName == '') {
        alert("Write BookName");
        return;
    }
    if(bookAuthor == '') {
        alert("Write Author");
        return;
    }
    if(price == '') {
        alert("Write price");
        return;
    }
    if(company == '') {
        alert("Write company");
        return;
    }

    $.post('/bookRegist',{
        bookId: bookId,
        bookName: bookName,
        bookAuthor: bookAuthor,
        price: price,
        company: company,
        category: category
    }, function () {
        $(location).attr("href","/main");
        alert("Regist Success");
    })
})