var data = [
  { year: '2012', a: 24.6, b: 30.9, c:24.8 },
  { year: '2013', a: 30.0, b: 27.5, c:20.0 },
  { year: '2014', a: 34.2, b: 20.3, c:18.3 },
  { year: '2015', a: 43.0, b: 17.2, c:15.1 },
  { year: '2016', a: 47.3, b: 12.3, c:11.4 }
],
config = {
  lineColors:['#337ab7','#FF5722','#4CAF50'],
  barColors:['#337ab7','#FF5722','#4CAF50'],
  data: data,
  xkey: 'year',
  ykeys: ['a', 'b', 'c'],
  labels: ['Google Chrome', 'Internet explorer', 'Mozilla firefox']
};

config.element = 'line-chart';
Morris.Line(config);
config.element = 'bar-chart';
Morris.Bar(config);
Morris.Donut({
  element: 'donut-chart',
  colors: ["#337ab7", "#4CAF50", "#FFC107", "#FF5722", "#5bc0de"],
  data: [
    {label: "Complete", value: 15},
    {label: "Active", value: 35},
    {label: "Pending", value: 25},
    {label: "Re-open", value: 10},
    {label: "New", value: 15}
  ]
});

$(function () { 
  $('button').click(function () {
    $('.side-menu').toggleClass('off');
    $('.side-body').toggleClass('full-width'); 
    $('.side-footer').toggleClass('full-width'); 
  });
});