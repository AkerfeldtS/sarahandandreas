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

function deleteCustomerByID(name) {

    console.log("Customer ID: " + name);
    $.ajax({
        type : "POST",
        url : "customer/deleteCustomer",
        data: customerID
    });
}

function deleteCustomerByID() {

    console.log("Customer ID: ");
    $.ajax({
        type : "POST",
        url : "customer/deleteCustomer",
        data: customerID
    });
}