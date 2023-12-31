; Script generated by the Inno Setup Script Wizard.
; SEE THE DOCUMENTATION FOR DETAILS ON CREATING INNO SETUP SCRIPT FILES!

#define MyAppName "Employee Payroll System"
#define MyAppVersion "1.0"
#define MyAppPublisher "Aniukwu Tochukwu"
#define MyAppExeName "employee_payroll.exe"

[Setup]
; NOTE: The value of AppId uniquely identifies this application.
; Do not use the same AppId value in installers for other applications.
; (To generate a new GUID, click Tools | Generate GUID inside the IDE.)
AppId={{5EB45C57-0041-44ED-BDF0-7246BB356C10}
AppName={#MyAppName}
AppVersion={#MyAppVersion}
;AppVerName={#MyAppName} {#MyAppVersion}
AppPublisher={#MyAppPublisher}
DefaultDirName={pf}\{#MyAppName}
DefaultGroupName={#MyAppName}
OutputBaseFilename=setup
Compression=lzma
SolidCompression=yes

[Languages]
Name: "english"; MessagesFile: "compiler:Default.isl"

[Tasks]
Name: "desktopicon"; Description: "{cm:CreateDesktopIcon}"; GroupDescription: "{cm:AdditionalIcons}"; Flags: unchecked

[Files]
Source: "C:\Users\Lady T\Documents\NetBeansProjects\Employee_Payroll_Management_System\employee_payroll.exe"; DestDir: "{app}"; Flags: ignoreversion
Source: "C:\Users\Lady T\Documents\NetBeansProjects\Employee_Payroll_Management_System\build.xml"; DestDir: "{app}"; Flags: ignoreversion
Source: "C:\Users\Lady T\Documents\NetBeansProjects\Employee_Payroll_Management_System\emp.xml"; DestDir: "{app}"; Flags: ignoreversion
Source: "C:\Users\Lady T\Documents\NetBeansProjects\Employee_Payroll_Management_System\employee_db.sql"; DestDir: "{app}"; Flags: ignoreversion
Source: "C:\Users\Lady T\Documents\NetBeansProjects\Employee_Payroll_Management_System\employee_payroll.exe"; DestDir: "{app}"; Flags: ignoreversion
Source: "C:\Users\Lady T\Documents\NetBeansProjects\Employee_Payroll_Management_System\flatlaf-2.4.jar"; DestDir: "{app}"; Flags: ignoreversion
Source: "C:\Users\Lady T\Documents\NetBeansProjects\Employee_Payroll_Management_System\flatlaf-3.1.1.jar"; DestDir: "{app}"; Flags: ignoreversion
Source: "C:\Users\Lady T\Documents\NetBeansProjects\Employee_Payroll_Management_System\flatlaf-extras-2.4.jar"; DestDir: "{app}"; Flags: ignoreversion
Source: "C:\Users\Lady T\Documents\NetBeansProjects\Employee_Payroll_Management_System\jcalendar-1.4.jar"; DestDir: "{app}"; Flags: ignoreversion
Source: "C:\Users\Lady T\Documents\NetBeansProjects\Employee_Payroll_Management_System\jdatepicker-2.0.3.jar"; DestDir: "{app}"; Flags: ignoreversion
Source: "C:\Users\Lady T\Documents\NetBeansProjects\Employee_Payroll_Management_System\manifest.mf"; DestDir: "{app}"; Flags: ignoreversion
Source: "C:\Users\Lady T\Documents\NetBeansProjects\Employee_Payroll_Management_System\miglayout-4.0.jar"; DestDir: "{app}"; Flags: ignoreversion
Source: "C:\Users\Lady T\Documents\NetBeansProjects\Employee_Payroll_Management_System\mysql-connector-j-8.2.0.jar"; DestDir: "{app}"; Flags: ignoreversion
Source: "C:\Users\Lady T\Documents\NetBeansProjects\Employee_Payroll_Management_System\TimingFramework-0.55.jar"; DestDir: "{app}"; Flags: ignoreversion
Source: "C:\Users\Lady T\Documents\NetBeansProjects\Employee_Payroll_Management_System\USER-READ-ME.txt"; DestDir: "{app}"; Flags: ignoreversion
Source: "C:\Users\Lady T\Documents\NetBeansProjects\Employee_Payroll_Management_System\build\*"; DestDir: "{app}"; Flags: ignoreversion recursesubdirs createallsubdirs
Source: "C:\Users\Lady T\Documents\NetBeansProjects\Employee_Payroll_Management_System\dist\*"; DestDir: "{app}"; Flags: ignoreversion recursesubdirs createallsubdirs
Source: "C:\Users\Lady T\Documents\NetBeansProjects\Employee_Payroll_Management_System\nbproject\*"; DestDir: "{app}"; Flags: ignoreversion recursesubdirs createallsubdirs
Source: "C:\Users\Lady T\Documents\NetBeansProjects\Employee_Payroll_Management_System\src\*"; DestDir: "{app}"; Flags: ignoreversion recursesubdirs createallsubdirs
; NOTE: Don't use "Flags: ignoreversion" on any shared system files

[Icons]
Name: "{group}\{#MyAppName}"; Filename: "{app}\{#MyAppExeName}"
Name: "{commondesktop}\{#MyAppName}"; Filename: "{app}\{#MyAppExeName}"; Tasks: desktopicon

[Run]
Filename: "{app}\{#MyAppExeName}"; Description: "{cm:LaunchProgram,{#StringChange(MyAppName, '&', '&&')}}"; Flags: nowait postinstall skipifsilent

