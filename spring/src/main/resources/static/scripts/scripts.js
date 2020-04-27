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

function deleteCustomerByID(id)
{
    var frm = document.getElementById(id);
    frm.submit();

}
