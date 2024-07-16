$(document).ready(function () {
    $('.center').slick({
        centerMode: true,
        centerPadding: '176px',
        slidesToShow: 1,
        prevArrow: false,
        nextArrow: false,
        responsive: [
            {
                breakpoint: 1440,
                settings: {
                    arrows: true,
                    centerMode: false,
                    centerPadding: '176px',
                    slidesToShow: 1,
                    prevArrow: false,
                    nextArrow: false
                }
            },
            {
                breakpoint: 480,
                settings: {
                    arrows: false,
                    centerMode: true,
                    centerPadding: '0px',
                    slidesToShow: 1,
                    prevArrow: false,
                    nextArrow: false
                }
            }
        ]
    });
});