function resetCustomerForm()
{
    document.getElementById("firstNameField").value = '';
    document.getElementById("lastNameField").value = '';
}

function submitForm(id)
{
    var frm = document.getElementById(id);
    frm.submit();
}

function deleteForm()
{
    var frm = document.getElementById("customerDelete");
    frm.submit();
}