# textools

## Installation

Requires JDK 7 with JAVA_HOME set to the JDK path!

    $ git clone git@github.com:simonharrer/textools
    $ cd textools
    $ gradlew installApp
    # add textools/build/install/textools/bin to PATH

## Usage

    # in your latex directory
    $ textools pdf # create the pdf with pdflatex and bibtex using main.tex as the starting file
    $ textools validate # validates all .tex and .bib files using Simon's validation rules
    $ textools clean # remove all generated files like .div, .pdf, .log, ...

## Commands

    textools [command]

     create-gitignore   creates a latex project specific .gitignore file
     clean              Removes all generated files during a tex build
     texlipse           generates texlipse project files
     texniccenter       generates the texniccenter project files
     validate           executes validate-latex and validate-bibtex commands in sequence
     validate-bibtex    validates all .bib files for the existence of certain fields
     validate-latex     validates .tex files
     pdf                creates pdf with pdflatex, including bibtex
     version            prints the current version

## Authors

Simon Harrer

## Contribute

- Fork
- Create feature branch
- Create commits
- Create pull request