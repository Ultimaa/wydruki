/*!
    * Start Bootstrap - SB Admin v6.0.3 (https://startbootstrap.com/template/sb-admin)
    * Copyright 2013-2021 Start Bootstrap
    * Licensed under MIT (https://github.com/StartBootstrap/startbootstrap-sb-admin/blob/master/LICENSE)
    */
(function($) {
    "use strict";

    // Add active state to sidbar nav links
    var path = window.location.href; // because the 'href' property of the DOM element is the absolute path
    $("#layoutSidenav_nav .sb-sidenav a.nav-link").each(function() {
        if (this.href === path) {
            $(this).addClass("active");
        }
    });

    // Toggle the side navigation
    $("#sidebarToggle").on("click", function(e) {
        e.preventDefault();
        $("body").toggleClass("sb-sidenav-toggled");
    });
})(jQuery);

function generateSelectTemp(s, min, max){
    var select = document.getElementById(s);

    for (var i = min; i<=max; i++){
        var opt = document.createElement('option');
        if (i == 0){
            opt.selected = true;
        }
        opt.value = i;
        opt.innerHTML = i;
        select.appendChild(opt);
    }
}

function generateSelectTime(s){
    var select = document.getElementById(s);

    for (var i = 1; i<=4; i++){
        var opt = document.createElement('option');
        j = i*15;
        opt.value = j;
        opt.innerHTML = j+" min";
        select.appendChild(opt);
    }
}
generateSelectTemp("temp", -25, 25);
generateSelectTemp("temp-range", 0, 5);
generateSelectTime("time-range");

$(function() {
    $('input[name="datetimes"]').daterangepicker({
        timePicker: true,
        timePicker24Hour: true,
        startDate: moment().startOf('hour'),
        endDate: moment().startOf('hour').add(32, 'hour'),
        locale: {
            format: 'YYYY-MM-DD hh:mm'
        }
    });
});