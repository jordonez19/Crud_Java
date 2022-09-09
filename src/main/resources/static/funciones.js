function sweetAlertDelete(id){
    swal({
        title: "Estas seguro de eliminar?",
        text: "Una vez eliminado no se podra recuperar la informacion!",
        icon: "warning",
        buttons: true,
        dangerMode: true,
    })
    .then((OK) => {
    if (OK) {
        $.ajax({
            url: "/eliminar/"+id,
            success: function(res){
                console.log(res);
            }
        });
        swal("Tu archivo ah sido eliminado con exito!", {
        icon: "success",
        }).then((willDelete) => {
            if(willDelete){
                location.href = "/listar";
            }
        });
    } else {
        swal("Tu archivo no se ha eliminado!", {
            icon: "error"
        });
    }
    });
}