/**
 * Created by zly on 2016/5/13.
 */

function ajaxR () {
    $.ajax({
        url : "ajax",
        success: function (data) {
            console.log(data);
        }
    });
}