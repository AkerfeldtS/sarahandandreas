function resetCustomerForm()
{
    document.getElementById("firstNameField").value = '';
    document.getElementById("lastNameField").value = '';
}

function submitForm(id)
{
    if(validateInputNames()) {
        var frm = document.getElementById(id);
        frm.submit();
    }
}

function deleteCustomerByID(id)
{
    var frm = document.getElementById(id);
    frm.submit();
}

function deleteAllCustomers(id) {
    var frm = document.getElementById(id);
    frm.submit();
}

function validateInputNames() {

    if(document.customerForm.firstName.value == "") {
        alert("Please type firstname");
        document.customerForm.firstName.focus();
        return false;
    }
    console.log("Firstname:" + document.customerForm.firstName.value);

    if(document.customerForm.lastName.value == "") {
        alert("Please type lastname");
        document.customerForm.lastName.focus();
        return false;
    }

    return true;
}