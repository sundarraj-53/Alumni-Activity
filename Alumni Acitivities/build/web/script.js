function validateform()
{
    var x=document.forms["form"]["form1"].value;
    var y=document.forms["form"]["form2"].value;
    var z=document.forms["form"]["form3"].value;
    var a=document.forms["form"]["form4"].value;
    var b=document.forms["form"]["form5"].value;
    var c=document.forms["form"]["form6"].value;
    var d=document.forms["form"]["gender"].value;
    if(x==="")
    {
        alert("first name must be filled out");
        return false;
    }
    if(y==="")
    {
        alert("Last name must be filled out");
        return false;
    }
    if(z==="")
    {
        alert("Email must be filled out");
        return false;
    }
    if(a==="")
    {
        alert("Phone number must be filled out");
        return false;
    }
    if(b==="")
    {
        alert("Year of Passed out must be filled out");
        return false;
    }
    if(c==="")
    {
        alert("Department must be filled out");
        return false;
    }
    if(d==="")
    {
        alert("gender must be filled out");
        return false;
    }
    }