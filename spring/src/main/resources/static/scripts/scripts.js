function resetCustomerForm()
{
    document.getElementById("firstNameField").value = '';
    document.getElementById("lastNameField").value = '';
}

function submitForm()
{
    var frm = document.getElementById("customerForm");
    frm.submit();
}