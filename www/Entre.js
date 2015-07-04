var entre = {
    addEntre: function(nom, prenom, successCallback, errorCallback) {
        cordova.exec(
            successCallback, // success callback function
            errorCallback, // error callback function
            'Entre', // mapped to our native Java class called "Calendar"
            'add', // with this action name
            [{                  // and this array of custom arguments to create our entry
                "nom": nom,
                "prenom": prenom
            }]
        );
     },
     getEntre: function(nom, successCallback, errorCallback) {
         cordova.exec(
             successCallback, // success callback function
             errorCallback, // error callback function
             'Entre', // mapped to our native Java class called "Calendar"
             'get', // with this action name
             [{                  // and this array of custom arguments to create our entry
                 "nom": nom
             }]
         );
      },
      deleteEntre: function(nom, successCallback, errorCallback) {
          cordova.exec(
              successCallback, // success callback function
              errorCallback, // error callback function
              'Entre', // mapped to our native Java class called "Calendar"
              'delete', // with this action name
              [{                  // and this array of custom arguments to create our entry
                  "nom": nom
              }]
          );
       },
       updateEntre: function(nom, prenom, successCallback, errorCallback) {
           cordova.exec(
               successCallback, // success callback function
               errorCallback, // error callback function
               'Entre', // mapped to our native Java class called "Calendar"
               'update', // with this action name
               [{                  // and this array of custom arguments to create our entry
                   "nom": nom,
                   "prenom": prenom
               }]
           );
        },
        getAllEntre: function(nom, prenom, successCallback, errorCallback) {
            cordova.exec(
                successCallback, // success callback function
                errorCallback, // error callback function
                'Entre', // mapped to our native Java class called "Calendar"
                'getAll', // with this action name
                []
            );
         }
}
module.exports = entre;
