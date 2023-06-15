( function () {
    'use strict';

    var multi = 'Sangat puas';
    var option = 'Ya';

    $('.answerlist1:contains('+multi+'), .answerlist:contains('+option+')').each(function(){
    $(this).parent().each(function(){
        $(this).find('.answerlist2').children().click()
    })
    });
})();