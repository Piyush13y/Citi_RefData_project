$(window).on("load", function(){

    $('.save-button').on('click', save_onclick);
    $('.cancel-button').on('click', cancel_onclick);
    $('.edit-button').on('click', edit_onclick);

    $('.save-button, .cancel-button').hide();
});

function edit_onclick(){
    setFormMode($(this).closest("form"), 'edit');
}

function cancel_onclick(){
    setFormMode($(this).closest("form"), 'view');

    //TODO: Undo input changes?
}

function save_onclick(){
    setFormMode($(this).closest("form"), 'view');

    //TODO: Send data to server?
}


function setFormMode($form, mode){
    switch(mode){
        case 'view':
            $form.find('.save-button, .cancel-button').hide();
            $form.find('.edit-button').show();
            $form.find("input, select").prop("disabled", true);
            break;
        case 'edit':
            $form.find('.save-button, .cancel-button').show();
            $form.find('.edit-button').hide();
            $form.find("input, select").prop("disabled", false);
            break;
    }
}